package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lry extends lrw {
    public lry(lrm lrmVar, String str, fse fseVar, lsw lswVar) {
        super(lrmVar.a(ltf.CYCLOPS_PANO, str, fseVar, lswVar, null, rvk.a, kfl.a().a(), lswVar.b));
    }

    @Override // defpackage.lrw, defpackage.lss
    public final synchronized void Z(pas pasVar) {
        super.Z(pasVar);
        S();
        this.b.M(l());
        lru lruVarI = i();
        jja jjaVarA = jjb.a();
        jjaVarA.a = m();
        lruVarI.c(jjaVarA.a());
    }

    @Override // defpackage.lrw, defpackage.lss
    public final synchronized syu u(byte[] bArr, mfo mfoVar) throws Throwable {
        Throwable th;
        lry lryVar;
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            J("saveAndFinish");
            try {
                if (N().m()) {
                    M("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
                    return s();
                }
                N().p(2, 3);
                mfoVar.c = g().b();
                N().q(3);
                ExifInterface exifInterface = (ExifInterface) mfoVar.b.f();
                if (exifInterface != null) {
                    ((mdo) o()).l = exifInterface;
                }
                lsu lsuVarJ = j();
                B().execute(new lqd((Object) this, (Object) bArr, (Object) lsuVarJ, 2, (char[]) null));
                return s();
            } catch (Throwable th3) {
                th = th3;
                lryVar = this;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            lryVar = this;
            th = th;
            throw th;
        }
    }
}
