package defpackage;

import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class asj implements uiq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ asj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [bry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v30, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Object, uif] */
    @Override // defpackage.uiq
    public final Object a(Object obj) {
        boolean z = true;
        int i = 0;
        switch (this.b) {
            case 0:
                ((Float) obj).floatValue();
                chq chqVarA = ((ejs) this.a).A();
                int i2 = asi.a;
                return Float.valueOf(chqVarA.dk(56.0f));
            case 1:
                bpv bpvVar = (bpv) obj;
                long jW = akg.w(bpvVar);
                aqx aqxVar = (aqx) this.a;
                ?? A = aqxVar.c.a();
                if (A != 0) {
                    arn arnVar = aqxVar.d;
                    long j = aqxVar.e;
                    if (A.dm() && aro.a(arnVar, j)) {
                        long jE = a.E(aqxVar.b, jW);
                        aqxVar.b = jE;
                        long jE2 = a.E(aqxVar.a, jE);
                        if (arnVar.f()) {
                            aqxVar.a = jE2;
                            aqxVar.b = 0L;
                        }
                    }
                }
                bpvVar.b();
                return ufg.a;
            case 2:
                return new ejs((ask) obj);
            case 3:
                return Boolean.valueOf(a.ao(((aso) obj).a, this.a));
            case 4:
                Object obj2 = this.a;
                if (obj != obj2) {
                    bar barVar = obj instanceof bar ? (bar) obj : null;
                    if ((barVar != null ? barVar.a : null) != obj2) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                return Integer.valueOf(((baw) ((ejs) this.a).a).a(((azq) obj).d));
            case 6:
                return Boolean.valueOf(a.ao(((ebn) obj).a, this.a));
            case 7:
                return Boolean.valueOf(this.a.contains(obj));
            case 8:
                return Boolean.valueOf(this.a.contains(obj));
            case 9:
                return Boolean.valueOf(((List) obj).retainAll(this.a));
            case 10:
                Object obj3 = this.a;
                synchronized (((bhg) obj3).f) {
                    bhf bhfVar = ((bhg) obj3).g;
                    bhfVar.getClass();
                    Object obj4 = bhfVar.b;
                    obj4.getClass();
                    int i3 = bhfVar.c;
                    zm zmVar = bhfVar.h;
                    if (zmVar == null) {
                        zmVar = new zm((byte[]) null);
                        bhfVar.h = zmVar;
                        bhfVar.j.j(obj4, zmVar);
                    }
                    bhfVar.b(obj, i3, obj4, zmVar);
                }
                return ufg.a;
            case 11:
                ((ddo) obj).getClass();
                return ((eci) this.a).call();
            case 12:
                dfa dfaVar = (dfa) obj;
                dfaVar.getClass();
                ((dbw) this.a).d = dfaVar;
                return ufg.a;
            case 13:
                ((ddo) obj).getClass();
                return this.a.a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                dbx dbxVar = (dbx) obj;
                dbxVar.getClass();
                return ((dco) this.a).d(dbxVar);
            case 15:
                bvo bvoVar = (bvo) obj;
                ((djk) this.a).d(bvoVar);
                bvoVar.p();
                return ufg.a;
            case 16:
                ((djk) this.a).f((btd) obj);
                return ufg.a;
            case 17:
                cbn cbnVar = (cbn) obj;
                Object obj5 = ((kbz) this.a).b;
                if (obj5 != null) {
                    cbw.d(cbnVar, (String) obj5);
                }
                if ((Float.floatToRawIntBits(Float.NaN) & Integer.MAX_VALUE) < 2139095040) {
                    uld[] uldVarArr = cbw.a;
                    cbz cbzVar = cbu.s;
                    uld uldVar = cbw.a[10];
                    cbnVar.e(cbzVar, Float.valueOf(Float.NaN));
                }
                return ufg.a;
            case 18:
                dlm dlmVar = (dlm) ((dkr) this.a).a.a();
                int iB = dlmVar.b();
                while (true) {
                    if (i >= iB) {
                        i = -1;
                    } else if (!a.ao(dlmVar.d(i), obj)) {
                        i++;
                    }
                }
                return Integer.valueOf(i);
            case 19:
                int iIntValue = ((Integer) obj).intValue();
                Object obj6 = this.a;
                ukc.C(((bij) obj6).C(), null, 0, new dkq((dkr) obj6, iIntValue, (uhb) null, 0), 3);
                return true;
            default:
                ((btd) obj).r((bte) this.a, 0L);
                return ufg.a;
        }
    }
}
