package defpackage;

import android.util.Log;
import com.google.android.gms.analytics.EQvQ.UvOvSgfD;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nta implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nta(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                ((ntf) this.a).O();
                break;
            case 1:
                ntf ntfVar = (ntf) this.a;
                if (ntfVar.D && !((ltw) ntfVar.t.dL()).equals(ltw.AUTO)) {
                    ntfVar.F().post(new nsz(ntfVar, 17));
                    break;
                }
                break;
            case 2:
                ((ntf) this.a).P();
                break;
            case 3:
                ((ntf) this.a).J();
                break;
            case 4:
                ((ntf) this.a).L();
                break;
            case 5:
                ntr ntrVar = (ntr) this.a;
                Boolean bool = (Boolean) obj;
                if (((Boolean) ((ovx) ntrVar.h).d).booleanValue()) {
                    if (!bool.booleanValue()) {
                        ntrVar.e(false);
                        ntrVar.n.e();
                        break;
                    } else {
                        ntrVar.e(true);
                        ntrVar.n.j();
                        break;
                    }
                }
                break;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    ((ntr) this.a).d();
                    break;
                }
                break;
            case 7:
                ntr ntrVar2 = (ntr) this.a;
                if (!ntrVar2.j) {
                    ntrVar2.a(false, true);
                    break;
                }
                break;
            case 8:
                ((ntr) this.a).a(false, true);
                break;
            case 9:
                if (!((Boolean) obj).booleanValue()) {
                    ((ntr) this.a).a(false, true);
                    break;
                }
                break;
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    ((ntr) this.a).a(true, false);
                    break;
                }
                break;
            case 11:
                this.a.run();
                break;
            case 12:
                ((ovx) this.a).a(obj);
                break;
            case 13:
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                Object obj2 = this.a;
                if (jLongValue <= 0) {
                    if (l.longValue() == -1) {
                        Log.w("AudioEncoder", UvOvSgfD.vPnU);
                        ((oys) obj2).E.e(null);
                        break;
                    }
                } else {
                    ((oys) obj2).i();
                    break;
                }
                break;
            default:
                ((oys) this.a).i();
                break;
        }
    }
}
