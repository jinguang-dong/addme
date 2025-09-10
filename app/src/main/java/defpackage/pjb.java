package defpackage;

import android.media.Image;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pjb implements poi {
    private final int a;
    private final int b;
    private final ByteBuffer c;

    public pjb(Image.Plane plane) {
        this.a = plane.getPixelStride();
        this.b = plane.getRowStride();
        this.c = plane.getBuffer();
    }

    @Override // defpackage.poi
    public final ByteBuffer getBuffer() {
        return this.c;
    }

    @Override // defpackage.poi
    public final int getPixelStride() {
        return this.a;
    }

    @Override // defpackage.poi
    public final int getRowStride() {
        return this.b;
    }
}
