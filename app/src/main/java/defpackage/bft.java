package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bft implements uiq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bft(bfv bfvVar, Object obj, bga bgaVar, int i) {
        this.d = i;
        this.b = bfvVar;
        this.a = obj;
        this.c = bgaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [cwh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiq
    public final Object a(Object obj) throws Resources.NotFoundException {
        int i = this.d;
        if (i == 0) {
            bfv bfvVar = (bfv) this.b;
            zu zuVar = bfvVar.c;
            Object obj2 = this.a;
            if (zu.e(zuVar, obj2)) {
                throw new IllegalArgumentException(a.bz(obj2, "Key ", " was used multiple times "));
            }
            Object obj3 = this.c;
            bfvVar.a.remove(obj2);
            zuVar.j(obj2, obj3);
            return new bfu(bfvVar, obj2, (bga) obj3);
        }
        if (i == 1) {
            mzg mzgVar = new mzg(this.b, 1);
            ?? r0 = this.c;
            Object obj4 = this.a;
            ((cwp) obj4).d(r0, mzgVar);
            return new adr(obj4, mzgVar, 3);
        }
        if (i != 2) {
            Context context = ((kqy) this.c).b;
            nlj.j((View) this.b, (View) this.a, context.getResources().getDimensionPixelOffset(R.dimen.minibar_hit_rect_padding), context.getResources().getDimensionPixelOffset(R.dimen.minibar_hit_rect_padding_width));
            return ufg.a;
        }
        Throwable th = (Throwable) obj;
        this.c.a(th);
        ?? r02 = ((gno) this.b).b;
        r02.u(th);
        while (true) {
            Object objA = uqq.a(r02.i());
            if (objA == null) {
                return ufg.a;
            }
            this.a.a(objA, th);
        }
    }

    public /* synthetic */ bft(cwp cwpVar, cwh cwhVar, azr azrVar, int i) {
        this.d = i;
        this.a = cwpVar;
        this.c = cwhVar;
        this.b = azrVar;
    }

    public /* synthetic */ bft(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }
}
