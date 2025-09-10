package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxx implements kmz {
    public static final byte[] a = ByteBuffer.allocate(12).order(ByteOrder.nativeOrder()).putInt(0).array();
    private static final byte[] b = ByteBuffer.allocate(12).order(ByteOrder.nativeOrder()).putInt(2).array();
    private final kmz c;
    private final ovx d = new ovx(a);
    private final hbj e;

    public kxx(kmz kmzVar, hbj hbjVar) {
        this.c = kmzVar;
        this.e = hbjVar;
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.c.a();
    }

    @Override // defpackage.kmz
    public final owf b() {
        gzi gziVar = gzo.a;
        return this.c.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lss] */
    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) {
        ?? r0 = ggaVar.b;
        if (r0.m() != ltf.LONG_SHOT) {
            this.c.c(kmyVar, ggaVar);
            return;
        }
        ovx ovxVar = this.d;
        ovxVar.a(b);
        mfo mfoVar = new mfo(ppo.c);
        mfoVar.a(new ExifInterface());
        r0.u(null, mfoVar).c(new kxw(ovxVar, 0), sxo.a);
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("delegate", this.c);
        return rwbVarW.toString();
    }
}
