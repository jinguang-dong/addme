package defpackage;

import android.location.Location;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsi extends lrw {
    public static final sgv c = sgv.g("lsi");
    public final lta d;
    public final ReentrantLock e;

    public lsi(lrm lrmVar, llm llmVar, lta ltaVar, String str, fse fseVar, lsw lswVar) {
        super(lrmVar.a(ltf.PHOTOSPHERE, str, fseVar, lswVar, llmVar, rvk.a, kfl.a().a(), lswVar.b));
        this.e = new ReentrantLock();
        this.d = ltaVar;
    }

    @Override // defpackage.lrw, defpackage.lss
    public final void E() {
        J("finish");
        if (!N().o()) {
            throw new IllegalStateException("Cannot call finish without calling startSession first.");
        }
        N().r(2, 3);
        B().execute(new lmw(this, 8));
    }

    @Override // defpackage.lrw, defpackage.lss
    public final void Z(pas pasVar) {
        super.Z(pasVar);
        S();
        this.b.M(l());
        lru lruVarI = i();
        jja jjaVarA = jjb.a();
        jjaVarA.a = m();
        lruVarI.c(jjaVarA.a());
    }

    @Override // defpackage.lrw, defpackage.lss
    public final syu u(byte[] bArr, mfo mfoVar) {
        bArr.getClass();
        ExifInterface exifInterface = (ExifInterface) mfoVar.b.f();
        J("saveAndFinish");
        if (N().m()) {
            M("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return s();
        }
        N().p(2, 3);
        mfoVar.c = g().b();
        N().q(3);
        if (g().b().h() && mfoVar.a == ppo.c && exifInterface != null) {
            pdb pdbVar = new pdb(exifInterface);
            pdbVar.d((Location) g().b().c());
            exifInterface = pdbVar.a;
        }
        if (exifInterface != null) {
            this.b.A.q(exifInterface);
            ((mdo) o()).l = exifInterface;
        }
        B().execute(new dwq(this, bArr, rwc.i(exifInterface), mfoVar, 11, null));
        return s();
    }

    public final void O() {
        J(yoGAhrpjU.MepskJvOXcexby);
        if (N().o()) {
            B().execute(new lmw(this, 9));
        } else {
            M("Ignoring updatePreview. CaptureSession is not started.");
        }
    }
}
