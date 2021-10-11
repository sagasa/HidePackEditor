package io;

import java.util.ArrayList;
import java.util.List;

/** メモリ効率重視のコレクタ */
public class ByteCollector {
	private static final int SIZE = 0x100000;

	private byte[] currentData = new byte[SIZE];
	private List<byte[]> array = new ArrayList<>();
	private int arrayCount, totalByte, currentByte;

	public void clear() {
		arrayCount = totalByte = currentByte = 0;
	}

	public void apend(byte[] data, int size) {
		if (SIZE < currentByte + size) {
			// ギリギリまで書き込み
			final int i = SIZE - currentByte;
			System.arraycopy(data, 0, currentData, currentByte, i);

			if (arrayCount < array.size()) {
				currentData = array.set(arrayCount, currentData);
			} else {
				array.add(currentData);
				currentData = new byte[SIZE];
			}
			arrayCount++;
			currentByte = 0;

			System.arraycopy(data, i, currentData, currentByte, size - i);
			currentByte += size - i;

		} else {
			System.arraycopy(data, 0, currentData, currentByte, size);
			currentByte += size;
		}
		totalByte += size;
	}

	public byte[] get() {
		byte[] res = new byte[totalByte];
		int pos = 0;
		for (int i = 0; i < arrayCount; i++) {
			byte[] arr = array.get(i);
			System.arraycopy(arr, 0, res, pos, SIZE);
			pos += SIZE;

		}
		System.arraycopy(currentData, 0, res, pos, currentByte);
		return res;
	}
}
