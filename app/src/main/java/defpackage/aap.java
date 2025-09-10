package defpackage;

import java.util.Arrays;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aap extends ujq implements uiq {
    private final /* synthetic */ int s;
    public static final aap r = new aap(20);
    public static final aap q = new aap(19);
    public static final aap p = new aap(17);
    public static final aap o = new aap(16);
    public static final aap n = new aap(15);
    public static final aap m = new aap(14);
    public static final aap l = new aap(13);
    public static final aap k = new aap(12);
    public static final aap j = new aap(11);
    public static final aap i = new aap(10);
    public static final aap h = new aap(9);
    public static final aap g = new aap(8);
    public static final aap f = new aap(7);
    public static final aap e = new aap(5);
    public static final aap d = new aap(4);
    public static final aap c = new aap(3);
    public static final aap b = new aap(1);
    public static final aap a = new aap(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aap(int i2) {
        super(1);
        this.s = i2;
    }

    @Override // defpackage.uiq
    public final /* synthetic */ Object a(Object obj) {
        boolean z = false;
        switch (this.s) {
            case 0:
                return new byz(b, new aaw((blz) obj, 1));
            case 1:
                long j2 = ((bkv) obj).g;
                float[] fArr = bmb.a;
                long jE = bkv.e(j2, bmb.x);
                return new acd(bkv.a(jE), bkv.d(jE), bkv.c(jE), bkv.b(jE));
            case 2:
                bjg bjgVar = (bjg) obj;
                if (!bjgVar.m.w) {
                    return bxc.b;
                }
                bjg bjgVar2 = bjgVar.d;
                bjgVar.d = null;
                bjgVar.b = null;
                return bxc.a;
            case 3:
                return ufg.a;
            case 4:
                return ufg.a;
            case 5:
                return Boolean.valueOf(((bkb) obj).e(7));
            case 6:
                return true;
            case 7:
                ((bug) obj).h().d = false;
                return ufg.a;
            case 8:
                bug bugVar = (bug) obj;
                bugVar.h().e = bugVar.h().d;
                return ufg.a;
            case 9:
                ((bug) obj).h().c = false;
                return ufg.a;
            case 10:
                bwn bwnVar = (bwn) obj;
                if (bwnVar.dn()) {
                    bwnVar.b.k();
                }
                return ufg.a;
            case 11:
                obj.getClass();
                return Boolean.valueOf(!((bwt) obj).dn());
            case 12:
                cbn cbnVarP = ((bvm) obj).p();
                if (cbnVarP != null && cbnVarP.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                return Boolean.valueOf(((bvm) obj).s.j(8));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                cbn cbnVarP2 = ((bvm) obj).p();
                if (cbnVarP2 != null && cbnVarP2.a && cbnVarP2.f(cbu.C)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                ((Number) obj).longValue();
                return ufg.a;
            case 16:
                return Integer.valueOf(((cbb) obj).b);
            case 17:
                return Integer.valueOf(((cbb) obj).c.a());
            case 18:
                long jLongValue = ((Number) obj).longValue() / 1000000;
                dof dofVar = dof.a;
                dof.b.h(jLongValue);
                return ufg.a;
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            default:
                ebx ebxVar = (ebx) obj;
                ebxVar.getClass();
                return true != ebxVar.d() ? "OneTime" : "Periodic";
        }
    }
}
