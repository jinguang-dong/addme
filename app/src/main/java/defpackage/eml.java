package defpackage;

import android.content.res.Resources;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Trace;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eml implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ eml(cdo cdoVar, cib cibVar, String str, chq chqVar, qqq qqqVar, int i) {
        this.f = i;
        this.c = cdoVar;
        this.b = cibVar;
        this.e = str;
        this.d = chqVar;
        this.a = qqqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v4, types: [emy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [chq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [hzs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.hardware.Camera$PictureCallback, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        emq emqVar;
        int i = this.f;
        int i2 = 6;
        byte[] bArr = null;
        if (i == 0) {
            emm emmVar = (emm) this.d;
            if (emmVar.g().d()) {
                return;
            }
            emr emrVar = emmVar.a;
            emrVar.e.e(6);
            Object obj = this.a;
            Object obj2 = this.e;
            int i3 = emq.b;
            if (obj == null || obj2 == null) {
                emqVar = null;
            } else {
                emqVar = new emq((Handler) obj, (AmbientMode.AmbientController) obj2);
            }
            Handler handler = (Handler) obj;
            emrVar.d.obtainMessage(601, new gga((Camera.ShutterCallback) emqVar, (Camera.PictureCallback) emo.a(handler, this.b), (Camera.PictureCallback) emo.a(handler, null), (Camera.PictureCallback) this.c)).sendToTarget();
            return;
        }
        if (i == 1) {
            Trace.beginSection("BackgroundTextMeasurement");
            Object obj3 = this.a;
            ?? r7 = this.d;
            Object obj4 = this.e;
            try {
                cdo cdoVarJ = byx.j((cdo) this.c, (cib) this.b);
                ufw ufwVar = ufw.a;
                new cgo((String) obj4, cdoVarJ, ufwVar, ufwVar, (qqq) obj3, r7).a();
                return;
            } finally {
                Trace.endSection();
            }
        }
        if (i == 2) {
            ((gds) this.a).c(true);
            if (((String) ((luj) this.b).b(luf.E)).equals(((Resources) this.c).getString(R.string.pref_camera_video_flashmode_torch)) && ((krj) this.d).f) {
                ((naw) this.e).d(nav.FLASH_DISABLED);
                return;
            }
            return;
        }
        int i4 = 19;
        int i5 = 5;
        if (i == 3) {
            Object obj5 = this.c;
            Object obj6 = this.a;
            htw htwVar = (htw) obj6;
            htv htvVar = (htv) obj5;
            htvVar.n = htwVar;
            fid fidVar = new fid(obj5, obj6, 20, bArr);
            our ourVar = (our) this.b;
            ourVar.d(fidVar);
            ?? r72 = this.d;
            htvVar.e = r72;
            ourVar.d(new fid(obj5, r72, i4, bArr));
            pfu pfuVar = (pfu) this.e;
            pdn pdnVarC = pfuVar.c(pfuVar.d(htwVar.b()), htwVar.b().c().f);
            ourVar.d(pdnVarC);
            pdnVarC.l(new fmz(obj6, obj5, i5, bArr));
            return;
        }
        if (i == 4) {
            mhs mhsVar = new mhs();
            mhsVar.c(this.b);
            mhsVar.d("DualScreen");
            mhsVar.g((mhp) this.a);
            Object obj7 = this.e;
            mhsVar.e(new ild(obj7, i5));
            mhsVar.f(new ild(obj7, i2));
            ((fqg) this.c).b.d(this.d.d(mhsVar.a()));
            return;
        }
        if (i != 5) {
            mhs mhsVar2 = new mhs();
            mhsVar2.d("MicroVideo");
            mhsVar2.c(this.b);
            mhsVar2.g((mhp) this.a);
            Object obj8 = this.e;
            mhsVar2.f(new jmr(obj8, 18));
            mhsVar2.e(new jmr(obj8, i4));
            ((fqg) this.c).b.d(this.d.d(mhsVar2.a()));
            return;
        }
        mhs mhsVar3 = new mhs();
        mhsVar3.d("Lobster");
        mhsVar3.c(this.b);
        mhsVar3.g((mhp) this.a);
        Object obj9 = this.e;
        mhsVar3.f(new jcq(obj9, 12));
        mhsVar3.e(new jcq(obj9, 13));
        ((fqg) this.c).b.d(this.d.d(mhsVar3.a()));
    }

    public eml(emm emmVar, Handler handler, AmbientMode.AmbientController ambientController, emy emyVar, Camera.PictureCallback pictureCallback, int i) {
        this.f = i;
        this.d = emmVar;
        this.a = handler;
        this.e = ambientController;
        this.b = emyVar;
        this.c = pictureCallback;
    }

    public /* synthetic */ eml(fqg fqgVar, mhq mhqVar, out outVar, mhp mhpVar, owq owqVar, int i) {
        this.f = i;
        this.c = fqgVar;
        this.d = mhqVar;
        this.b = outVar;
        this.a = mhpVar;
        this.e = owqVar;
    }

    public /* synthetic */ eml(gds gdsVar, luj lujVar, Resources resources, krj krjVar, naw nawVar, int i) {
        this.f = i;
        this.a = gdsVar;
        this.b = lujVar;
        this.c = resources;
        this.d = krjVar;
        this.e = nawVar;
    }

    public /* synthetic */ eml(our ourVar, htv htvVar, htw htwVar, hzs hzsVar, pfu pfuVar, int i) {
        this.f = i;
        this.b = ourVar;
        this.c = htvVar;
        this.a = htwVar;
        this.d = hzsVar;
        this.e = pfuVar;
    }
}
