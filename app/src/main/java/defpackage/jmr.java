package defpackage;

import android.os.Handler;
import androidx.wear.ambient.AmbientMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jmr implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jmr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v62, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v63, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r7v66, types: [java.lang.Object, owq] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i;
        ArrayList arrayListAB;
        switch (this.b) {
            case 0:
                ((nca) this.a).g();
                return;
            case 1:
                ((nca) this.a).h();
                return;
            case 2:
                ?? r7 = this.a;
                int i2 = jmv.d;
                r7.a(true);
                return;
            case 3:
                ?? r72 = this.a;
                int i3 = jmv.d;
                r72.a(false);
                return;
            case 4:
                gga ggaVarE = ((jmw) this.a).e();
                if (ggaVarE == null) {
                    ((sgt) jmw.a.b().M(2853)).s("Unable to signal long press end. Resources unexpectedly null.");
                    return;
                }
                Object obj = ggaVarE.a;
                jsf jsfVar = (jsf) obj;
                long jA = jsfVar.b.a();
                synchronized (obj) {
                    ((jsf) obj).f = TimeUnit.NANOSECONDS.toMicros(jA);
                    ((jsf) obj).e.set(false);
                    arrayListAB = ujp.aB(((jsf) obj).d);
                }
                jsfVar.a.b(mn.h(jA, "onLongPressEnded at "));
                int size = arrayListAB.size();
                for (i = 0; i < size; i++) {
                    ((jse) arrayListAB.get(i)).d(TimeUnit.NANOSECONDS.toMicros(jA));
                }
                return;
            case 5:
                ((jom) this.a).b();
                return;
            case 6:
                Object obj2 = this.a;
                synchronized (obj2) {
                    Handler handler = ((jom) obj2).b;
                    handler.getLooper().quitSafely();
                    handler.removeCallbacksAndMessages(null);
                    rwc rwcVar = ((jom) obj2).a;
                    if (rwcVar.h()) {
                        ((hpg) rwcVar.c()).close();
                    }
                }
                return;
            case 7:
                ((hpg) ((jom) this.a).a.c()).a();
                return;
            case 8:
                ((jpm) this.a).c();
                return;
            case 9:
                Object obj3 = this.a;
                jpp jppVar = (jpp) obj3;
                jppVar.f();
                jppVar.d.post(new jmr(obj3, 13));
                return;
            case 10:
                ((jpp) this.a).d();
                return;
            case 11:
                jpp jppVar2 = (jpp) this.a;
                if (!jppVar2.s) {
                    jppVar2.l.set(0L);
                }
                jppVar2.s = true;
                jppVar2.c.b(true);
                jppVar2.d();
                return;
            case 12:
                jpp jppVar3 = (jpp) this.a;
                if (!jppVar3.s) {
                    jppVar3.c();
                    return;
                } else {
                    jppVar3.r = true;
                    jppVar3.d();
                    return;
                }
            case 13:
                jpp jppVar4 = (jpp) this.a;
                jppVar4.b.h();
                rwc rwcVar2 = jppVar4.f;
                if (rwcVar2.h()) {
                    ((hgj) rwcVar2.c()).k(jppVar4);
                }
                jppVar4.h = true;
                jppVar4.d.getLooper().quitSafely();
                jppVar4.e.getLooper().quitSafely();
                jppVar4.u.close();
                jppVar4.p.close();
                jppVar4.q.close();
                jppVar4.o.close();
                jqb jqbVar = jppVar4.t;
                jqbVar.b(true);
                jqbVar.b.execute(new jmr(jqbVar, 16));
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((jpp) this.a).d();
                return;
            case 15:
                ((jqb) this.a).c();
                return;
            case 16:
                jqb jqbVar2 = (jqb) this.a;
                jqbVar2.c();
                qfc qfcVar = jqbVar2.o;
                if (qfcVar != null) {
                    jqbVar2.o = null;
                    qfcVar.close();
                }
                AmbientMode.AmbientController ambientController = jqbVar2.q;
                if (ambientController != null) {
                    ambientController.g();
                    jqbVar2.q = null;
                    return;
                }
                return;
            case 17:
                try {
                    if (((joo) this.a.a()).d()) {
                        return;
                    }
                    ((sgt) jqh.a.c().M(3025)).s("Prewarm of microvideo encoder failed... will try again later!");
                    return;
                } catch (RuntimeException e) {
                    ((sgt) ((sgt) jqh.a.c().i(e)).M((char) 3026)).s("Prewarm of microvideo encoder failed... will try again later!");
                    return;
                }
            case 18:
                this.a.a(true);
                return;
            case 19:
                this.a.a(false);
                return;
            default:
                ((rah) this.a).c.a(true);
                return;
        }
    }
}
