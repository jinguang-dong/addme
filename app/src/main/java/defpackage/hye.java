package defpackage;

import android.os.Handler;
import android.os.Looper;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hye implements paq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hye(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [itk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, paq] */
    /* JADX WARN: Type inference failed for: r4v22, types: [fel, java.lang.Object] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                ((hyf) this.a).a();
                break;
            case 1:
                new Handler(Looper.getMainLooper()).postDelayed(new hvm(this.a, 4, null), 20000L);
                break;
            case 2:
                ((icd) this.a).c();
                break;
            case 3:
                jdh jdhVar = (jdh) this.a;
                ((fvu) jdhVar.a).B((gsn) jdhVar.l);
                break;
            case 4:
                jdh jdhVar2 = (jdh) this.a;
                ((itl) jdhVar2.c).g(jdhVar2.d);
                break;
            case 5:
                imi imiVar = (imi) this.a;
                imiVar.r.c(imiVar.e);
                break;
            case 6:
                ivb ivbVar = (ivb) this.a;
                ivbVar.b.g(ivbVar);
                break;
            case 7:
                ((sgt) ivg.a.c().M(2347)).s("OneCamera closed, interrupting capture.");
                this.a.cancel(false);
                break;
            case 8:
                this.a.close();
                break;
            case 9:
                Object obj = this.a;
                ((jbc) obj).au.a(obj);
                break;
            case 10:
                this.a.b();
                break;
            case 11:
                jbm jbmVar = (jbm) this.a;
                jbmVar.j.B(jbmVar.Q);
                break;
            case 12:
                jbm jbmVar2 = (jbm) this.a;
                jbmVar2.k.g(jbmVar2.C);
                break;
            case 13:
                Object obj2 = this.a;
                ((jby) obj2).V.a(obj2);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                jby jbyVar = (jby) this.a;
                jbyVar.m.B(jbyVar.ae);
                break;
            case 15:
                ((jby) this.a).G.a(false);
                break;
            case 16:
                jby jbyVar2 = (jby) this.a;
                jbyVar2.f.g(jbyVar2.T);
                break;
            case 17:
                ((jby) this.a).r.a();
                break;
            case 18:
                ((jcm) ((fxw) this.a).a).k.a(false);
                break;
            case 19:
                Object obj3 = this.a;
                ((jcv) obj3).T.a(obj3);
                break;
            default:
                jcv jcvVar = (jcv) this.a;
                jcvVar.o.B(jcvVar.ab);
                break;
        }
    }
}
