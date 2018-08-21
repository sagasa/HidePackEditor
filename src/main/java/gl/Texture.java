package gl;

/*
 * Copyright (c) 2002-2008 LWJGL Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'LWJGL' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import static org.lwjgl.opengl.GL11.glBindTexture;
import static org.lwjgl.opengl.GL11.glDeleteTextures;
import static org.lwjgl.opengl.GL11.glTexCoord2f;

public class Texture {
    private int     target;
    private int     textureID;

    private int     width;
    private int     height;

    private int     texWidth;
    private int     texHeight;

    private boolean isAlphaPremultiplied;

    public Texture(int target, int textureID) {
        this.target = target;
        this.textureID = textureID;
        this.isAlphaPremultiplied = true;
    }

    public void point(int srcX, int srcY) {
        float   tx = 1.0f * srcX / texWidth;
        float   ty = 1.0f * srcY / texHeight;

        glTexCoord2f(tx, ty);
    }

    void setTextureHeight(int texHeight) {
        this.texHeight = texHeight;
    }

    void setTextureWidth(int texWidth) {
        this.texWidth = texWidth;
    }

    int getTextureWidth() {
        return texWidth;
    }

    int getTextureHeight() {
        return texHeight;
    }

    public int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    public boolean isAlphaPremultiplied() {
        return isAlphaPremultiplied;
    }

    void setAlphaPremultiplied(boolean isAlphaPremultiplied) {
        this.isAlphaPremultiplied = isAlphaPremultiplied;
    }

    public void dispose() {
        if (0 < textureID) {
            glDeleteTextures(textureID);
            textureID = -1;
        }
    }

    public void bind() {
        glBindTexture(target, textureID);
    }

}