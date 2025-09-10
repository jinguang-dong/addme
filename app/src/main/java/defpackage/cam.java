package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cam extends ujq implements uiu {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cam(Object obj, Object obj2, int i) {
        super(2);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [bwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, uif] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            ayc aycVar = (ayc) obj;
            int iIntValue = ((Number) obj2).intValue();
            int i2 = iIntValue & 3;
            if (aycVar.H(i2 != 2, iIntValue & 1)) {
                AndroidCompositionLocals_androidKt.a(((can) this.a).a, this.b, aycVar, 0);
            } else {
                aycVar.r();
            }
            return ufg.a;
        }
        if (i == 1) {
            ?? r0 = this.a;
            bwi bwiVar = (bwi) r0;
            bku bkuVar = (bku) obj;
            bmz bmzVar = (bmz) obj2;
            if (bwiVar.s.ah()) {
                bwiVar.A = bkuVar;
                bwiVar.z = bmzVar;
                bwiVar.Y().d(r0, bwi.o, this.b);
                bwiVar.B = false;
            } else {
                bwiVar.B = true;
            }
            return ufg.a;
        }
        ayc aycVar2 = (ayc) obj;
        int iIntValue2 = ((Number) obj2).intValue();
        if (aycVar2.H((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            Object obj3 = this.a;
            can canVar = (can) obj3;
            bxv bxvVar = canVar.a;
            Object tag = bxvVar.getTag(R.id.inspection_slot_table_set);
            Set set = ukc.d(tag) ? (Set) tag : null;
            if (set == null) {
                Object parent = bxvVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = ukc.d(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(aycVar2.d());
                aycVar2.i();
            }
            boolean zD = aycVar2.D(obj3);
            Object objF = aycVar2.f();
            if (zD || objF == ayb.a) {
                objF = new si(canVar, (uhb) null, 8);
                aycVar2.w(objF);
            }
            azb.f(bxvVar, (uiu) objF, aycVar2);
            boolean zD2 = aycVar2.D(obj3);
            Object objF2 = aycVar2.f();
            if (zD2 || objF2 == ayb.a) {
                objF2 = new si(canVar, (uhb) null, 9, (byte[]) null);
                aycVar2.w(objF2);
            }
            azb.f(bxvVar, (uiu) objF2, aycVar2);
            bay.K(bhy.a.b(set), bdq.k(-280240369, new cam(obj3, this.b, 0), aycVar2), aycVar2, 56);
        } else {
            aycVar2.r();
        }
        return ufg.a;
    }
}
