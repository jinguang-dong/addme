package defpackage;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pje implements poo {
    private final Object a = new Object();
    private final ImageReader b;

    public pje(ImageReader imageReader) {
        this.b = imageReader;
    }

    @Override // defpackage.poo
    public final int a() {
        int height;
        synchronized (this.a) {
            height = this.b.getHeight();
        }
        return height;
    }

    @Override // defpackage.poo
    public final int b() {
        int imageFormat;
        synchronized (this.a) {
            imageFormat = this.b.getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.poo
    public final int c() {
        int maxImages;
        synchronized (this.a) {
            maxImages = this.b.getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.poo, defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            this.b.close();
        }
    }

    @Override // defpackage.poo
    public final int d() {
        int width;
        synchronized (this.a) {
            width = this.b.getWidth();
        }
        return width;
    }

    @Override // defpackage.poo
    public final Surface e() {
        Surface surface;
        synchronized (this.a) {
            surface = this.b.getSurface();
        }
        return surface;
    }

    @Override // defpackage.poo
    public final poj f() {
        synchronized (this.a) {
            Image imageAcquireLatestImage = this.b.acquireLatestImage();
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new pjc(imageAcquireLatestImage);
        }
    }

    @Override // defpackage.poo
    public final poj g() {
        synchronized (this.a) {
            Image imageAcquireNextImage = this.b.acquireNextImage();
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new pjc(imageAcquireNextImage);
        }
    }

    @Override // defpackage.poo
    public final void h() {
        synchronized (this.a) {
            this.b.discardFreeBuffers();
        }
    }

    @Override // defpackage.poo
    public final void i(final pon ponVar, Handler handler) {
        synchronized (this.a) {
            this.b.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: pjd
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    ponVar.eS();
                }
            }, handler);
        }
    }

    public final String toString() {
        rwb rwbVarW;
        synchronized (this.a) {
            rwbVarW = rnt.W(this.b);
        }
        rwbVarW.e("width", d());
        rwbVarW.e("height", a());
        rwbVarW.b("format", qpt.ay(b()));
        rwbVarW.e("max images", c());
        return rwbVarW.toString();
    }
}
