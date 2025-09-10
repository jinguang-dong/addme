package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cwx extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwx(Context context, ceo ceoVar, String str, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.c = context;
        this.b = ceoVar;
        this.d = str;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((cwx) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 1) {
            return ((cwx) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((cwx) c((uqx) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, urk] */
    @Override // defpackage.uhn
    public final Object b(Object obj) throws Throwable {
        Object objI;
        uqx uqxVar;
        int i = this.f;
        if (i == 0) {
            uhi uhiVar = uhi.a;
            if (this.a != 0) {
                rnt.aN(obj);
            } else {
                rnt.aN(obj);
                und undVar = (und) this.e;
                una unaVar = unr.a;
                uoz uozVarI = uvw.a.i();
                cww cwwVar = new cww((cwc) this.b, (cwb) this.c, undVar, this.d, null);
                this.a = 1;
                if (ung.s(uozVarI, cwwVar, this) == uhiVar) {
                    return uhiVar;
                }
            }
            return ufg.a;
        }
        if (i != 1) {
            uhi uhiVar2 = uhi.a;
            int i2 = this.a;
            rnt.aN(obj);
            if (i2 != 0) {
                return obj;
            }
            und undVar2 = (und) this.e;
            uon uonVar = new uon(null);
            ptq ptqVar = ptq.a;
            CancellationSignal cancellationSignal = new CancellationSignal();
            ukc.C(undVar2, uonVar, 0, new ptn(null), 2).o(new ndd(cancellationSignal, 12));
            Context context = (Context) this.c;
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                throw new IllegalStateException("No content resolver");
            }
            Object obj2 = this.b;
            uhf uhfVar = ((ptm) obj2).f;
            ptp ptpVar = new ptp(context, contentResolver, (String) this.d, cancellationSignal, (ceo) obj2, uonVar, null);
            this.a = 1;
            Object objS = ung.s(uhfVar, ptpVar, this);
            return objS == uhiVar2 ? uhiVar2 : objS;
        }
        Object obj3 = uhi.a;
        if (this.a != 0) {
            uqxVar = (uqx) this.e;
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            uqx uqxVar2 = (uqx) this.e;
            Object obj4 = this.b;
            Object obj5 = this.c;
            crq crqVar = new crq((urk) this.d, uqxVar2, (uhb) null, 2);
            this.e = uqxVar2;
            this.a = 1;
            if (obj5 == cwb.b) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            }
            cwc cwcVar = (cwc) obj4;
            if (cwcVar.a == cwb.a || (objI = ung.i(new cwx(cwcVar, (cwb) obj5, crqVar, (uhb) null, 0), this)) != obj3) {
                objI = ufg.a;
            }
            if (objI == obj3) {
                return obj3;
            }
            uqxVar = uqxVar2;
        }
        uqxVar.u(null);
        return ufg.a;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, urk] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.b;
            cwc cwcVar = (cwc) obj2;
            cwx cwxVar = new cwx(cwcVar, (cwb) this.c, (uiu) this.d, uhbVar, 0);
            cwxVar.e = obj;
            return cwxVar;
        }
        if (i != 1) {
            Object obj3 = this.c;
            Context context = (Context) obj3;
            cwx cwxVar2 = new cwx(context, (ceo) this.b, (String) this.d, uhbVar, 2);
            cwxVar2.e = obj;
            return cwxVar2;
        }
        Object obj4 = this.b;
        cwc cwcVar2 = (cwc) obj4;
        cwx cwxVar3 = new cwx(cwcVar2, (cwb) this.c, (urk) this.d, uhbVar, 1);
        cwxVar3.e = obj;
        return cwxVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwx(cwc cwcVar, cwb cwbVar, uiu uiuVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.b = cwcVar;
        this.c = cwbVar;
        this.d = uiuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwx(cwc cwcVar, cwb cwbVar, urk urkVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.b = cwcVar;
        this.c = cwbVar;
        this.d = urkVar;
    }
}
