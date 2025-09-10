package defpackage;

import android.os.Handler;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jni implements syf {
    final /* synthetic */ jnl a;
    final /* synthetic */ jnk b;
    final /* synthetic */ jnm c;

    public jni(jnm jnmVar, jnl jnlVar, jnk jnkVar) {
        this.a = jnlVar;
        this.b = jnkVar;
        this.c = jnmVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        jnl jnlVar = this.a;
        if (jnlVar.o.b().isCancelled()) {
            this.c.e(jnlVar, th, this.b);
        } else {
            this.c.d(jnlVar, th, this.b);
        }
    }

    @Override // defpackage.syf
    public final void b(Object obj) {
        String str = CGlJpiVWrCQOq.VEUlRxjhSlqWPX;
        jnl jnlVar = this.a;
        jpi jpiVarA = jnlVar.d.a();
        long j = jpiVarA.d - jpiVarA.c;
        jnm jnmVar = this.c;
        jnk jnkVar = this.b;
        if (jnlVar.p) {
            jnmVar.h(jnlVar, jnkVar, j);
            return;
        }
        kbw kbwVar = jnlVar.i;
        hbj hbjVar = jnmVar.t;
        gzi gziVar = gzq.a;
        try {
            lsu lsuVar = jnkVar.e;
            pos posVar = lsuVar.b;
            OutputStream outputStreamE = posVar.e();
            rwc rwcVar = jnkVar.b;
            if (rwcVar.h()) {
                outputStreamE = ((ExifInterface) rwcVar.c()).m(outputStreamE);
            }
            try {
                szh szhVar = jnlVar.h;
                rnt.L(szhVar.isDone());
                syu syuVar = jnlVar.s;
                rnt.L(syuVar.isDone());
                long jLongValue = ((Long) ske.V(szhVar)).longValue() - ((Long) ske.V(syuVar)).longValue();
                if (jLongValue < 0) {
                    ((sgt) jnm.a.b().M(2865)).u("Negative shutter presentation timestamp detected (%d). Resetting to 0.", jLongValue);
                    jLongValue = 0;
                }
                if (hbjVar.p(haa.T)) {
                    jnmVar.k.a(jnlVar.c.b);
                }
                lsu lsuVar2 = jnlVar.c;
                pos posVar2 = lsuVar2.b;
                int iA = (int) posVar2.a();
                if (iA < 100000) {
                    ((sgt) jnm.a.c().M(2864)).t("Bundled video file too small (%d bytes)", iA);
                }
                try {
                    FileInputStream fileInputStreamD = posVar2.d();
                    try {
                        boolean zG = jnmVar.g(false);
                        if (zG) {
                            posVar.h("MP");
                        } else {
                            posVar.h("MV");
                        }
                        char c = true != zG ? (char) 1 : (char) 2;
                        edw edwVar = rwcVar.h() ? (edw) pqw.c(((ExifInterface) rwcVar.c()).bA).f() : null;
                        byte[] bArr = jnkVar.d;
                        rwd rwdVarD = pqw.d(bArr, edwVar);
                        edw edwVar2 = (edw) rwdVarD.a;
                        edw edwVar3 = (edw) rwdVarD.b;
                        AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(bArr, null);
                        qdy qdyVar = new qdy(iA, fileInputStreamD);
                        if (new AtomicBoolean(false).getAndSet(true)) {
                            throw new IllegalStateException("Executed command more than once. This is unexpected");
                        }
                        try {
                            if (c != 1) {
                                rap rapVar = new rap();
                                rapVar.b = "MotionPhoto";
                                rapVar.a = "video/mp4";
                                rapVar.c(0);
                                rapVar.b(qdyVar.a);
                                raq raqVarA = rapVar.a();
                                if (edwVar3 != null && qsp.t(edwVar3)) {
                                    qsp.u(edwVar3, jLongValue, raqVarA);
                                } else if (qsp.t(edwVar2)) {
                                    qsp.u(edwVar2, jLongValue, raqVarA);
                                } else {
                                    rap rapVar2 = new rap();
                                    rapVar2.b = "Primary";
                                    rapVar2.c(0);
                                    rapVar2.b(0);
                                    rapVar2.a = "image/jpeg";
                                    qsp.u(edwVar2, jLongValue, rapVar2.a(), raqVarA);
                                }
                                qsp.av(ambientController, edwVar2, edwVar3, qdyVar, outputStreamE);
                            } else {
                                int i = qdyVar.a;
                                edy.a.c(str, "GCamera");
                                edwVar2.c(str, "MicroVideo", 1);
                                edwVar2.c(str, "MicroVideoVersion", 1);
                                edwVar2.c(str, "MicroVideoOffset", Integer.valueOf(i));
                                edwVar2.c(str, "MicroVideoPresentationTimestampUs", Long.valueOf(jLongValue));
                                qsp.av(ambientController, edwVar2, edwVar3, qdyVar, outputStreamE);
                            }
                            lsuVar2.a();
                            fileInputStreamD.close();
                            outputStreamE.close();
                            fileInputStreamD.close();
                            outputStreamE.close();
                            mdm mdmVar = jnkVar.c;
                            mdmVar.d(posVar.a());
                            boolean z = jog.a;
                            gzi gziVar2 = gzz.a;
                            boolean z2 = jog.a;
                            boolean z3 = jog.a;
                            boolean z4 = jog.a;
                            boolean z5 = jog.a;
                            lsuVar.b();
                            Handler handler = jnmVar.l;
                            ltd ltdVar = jnlVar.a;
                            handler.removeCallbacksAndMessages(ltdVar);
                            if (jnlVar.l.getAndSet(true)) {
                                ((sgt) jnm.a.c().M(2905)).v("Took too long to finish microvideo for %s!", ltdVar);
                                return;
                            }
                            ((mdo) mdmVar).p = jnm.i(jnlVar, System.currentTimeMillis());
                            szh szhVar2 = jnlVar.n;
                            rnt.L(!szhVar2.isDone());
                            szhVar2.e(jnkVar.a);
                            lsuVar2.a();
                        } catch (edv e) {
                            throw new IOException("XMP serialization encountered an issue.", e);
                        }
                    } finally {
                    }
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            } finally {
            }
        } catch (Throwable th) {
            jnmVar.d(jnlVar, th, jnkVar);
            jnkVar.e.a();
            jnlVar.c.a();
        }
    }
}
