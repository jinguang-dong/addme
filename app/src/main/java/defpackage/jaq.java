package defpackage;

import android.os.SystemClock;
import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jaq implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jaq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, mxl] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, jjv] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, ndj] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (!zBooleanValue) {
                    ((jbc) obj2).ar.c();
                    break;
                } else {
                    lmx lmxVar = ((jbc) obj2).ar;
                    lmxVar.b = SystemClock.uptimeMillis();
                    lnc lncVar = lmxVar.a;
                    rnt.x(lncVar);
                    lncVar.c();
                    lmxVar.e();
                    lmxVar.f();
                    break;
                }
            case 1:
                this.a.az((ltw) obj);
                break;
            case 2:
                ((jbc) this.a).k(((Boolean) obj).booleanValue());
                break;
            case 3:
                ((jjn) this.a).k(((Boolean) obj).booleanValue());
                break;
            case 4:
                ((jjn) this.a).b(((Boolean) obj).booleanValue());
                break;
            case 5:
                if (!((Boolean) obj).booleanValue()) {
                    jjn jjnVar = (jjn) this.a;
                    jjnVar.p();
                    jjnVar.l = false;
                    break;
                }
                break;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    jjn jjnVar2 = (jjn) this.a;
                    if (((Boolean) jjnVar2.j.dL()).booleanValue()) {
                        jjnVar2.q();
                        break;
                    }
                }
                break;
            case 7:
                gxj gxjVar = (gxj) obj;
                Object obj3 = this.a;
                if (gxjVar != gxj.b) {
                    jjn jjnVar3 = (jjn) obj3;
                    if (jjnVar3.l) {
                        jjnVar3.v();
                        jjnVar3.l = false;
                        break;
                    }
                } else {
                    jjn jjnVar4 = (jjn) obj3;
                    if (jjnVar4.A() && ((Optional) jjnVar4.g.dL()).isPresent()) {
                        jjnVar4.p();
                        jjnVar4.l = true;
                        break;
                    }
                }
                break;
            case 8:
                this.a.eH((mxm) obj);
                break;
            case 9:
                sgv sgvVar = jjn.a;
                this.a.f(!((Boolean) obj).booleanValue());
                break;
            case 10:
                ((jjn) this.a).l(jjs.PRO_FOCUS, ((Boolean) obj).booleanValue());
                break;
            case 11:
                ((jjn) this.a).l(jjs.PRO_NONFOCUS, ((Boolean) obj).booleanValue());
                break;
            case 12:
                ((jjn) this.a).d(((Boolean) obj).booleanValue());
                break;
            case 13:
                ((jjn) this.a).g((hhv) obj);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((jjn) this.a).o(((Boolean) obj).booleanValue());
                break;
            case 15:
                ((jjn) this.a).i((nkw) obj);
                break;
            case 16:
                ((jjn) this.a).t();
                break;
            case 17:
                ((jjn) this.a).j(((Boolean) obj).booleanValue());
                break;
            case 18:
                jjn jjnVar5 = (jjn) this.a;
                if (!jjnVar5.z()) {
                    jjnVar5.u(false);
                    break;
                } else {
                    jjnVar5.u(((Optional) jjnVar5.g.dL()).isEmpty());
                    break;
                }
            case 19:
                ((jjn) this.a).q();
                break;
            default:
                ((jjn) this.a).h(((Boolean) obj).booleanValue());
                break;
        }
    }
}
