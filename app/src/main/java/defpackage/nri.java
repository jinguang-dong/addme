package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nri implements uiw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nri(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, uiv] */
    @Override // defpackage.uiw
    public final /* synthetic */ Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.b != 0) {
            byz byzVar = (byz) obj;
            ((Number) obj2).intValue();
            ayc aycVar = (ayc) obj3;
            int iIntValue = ((Number) obj4).intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= true == aycVar.B(byzVar) ? 4 : 2;
            }
            if (aycVar.H((iIntValue & ScriptIntrinsicBLAS.NON_UNIT) != 130, iIntValue & 1)) {
                this.a.a(byzVar, aycVar, Integer.valueOf(iIntValue & 14));
            } else {
                aycVar.r();
            }
            return ufg.a;
        }
        akx akxVar = (akx) obj;
        ayc aycVar2 = (ayc) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        akxVar.getClass();
        ((alv) obj2).getClass();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= true != aycVar2.B(akxVar) ? 2 : 4;
        }
        if ((iIntValue2 & ScriptIntrinsicBLAS.NON_UNIT) == 130 && aycVar2.G()) {
            aycVar2.r();
        } else {
            bik bikVarAR = byi.aR(amd.b, bkv.a, bll.a);
            bic bicVar = bib.e;
            akl aklVarC = akq.c(byx.c(R.dimen.wear_tap_to_open_camera_content_space, aycVar2));
            dki dkiVar = new dki(1, 2);
            Object obj5 = this.a;
            aycVar2.u(5004770);
            int i = iIntValue2 & 14;
            Object objF = aycVar2.f();
            if (i == 4 || objF == ayb.a) {
                objF = new ndd(akxVar, 11);
                aycVar2.w(objF);
            }
            aycVar2.n();
            AmbientLifecycleObserverKt.h(bikVarAR, (dlh) obj5, null, aklVarC, bicVar, null, false, null, dkiVar, null, null, (uiq) objF, aycVar2, 196614, 6);
        }
        return ufg.a;
    }
}
