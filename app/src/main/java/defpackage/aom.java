package defpackage;

import android.view.View;
import androidx.compose.foundation.lazy.layout.TraversablePrefetchStateModifierElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aom implements uiv {
    final /* synthetic */ aov a;
    final /* synthetic */ bik b;
    final /* synthetic */ uiu c;
    final /* synthetic */ bbo d;

    public aom(aov aovVar, bik bikVar, uiu uiuVar, bbo bboVar) {
        this.a = aovVar;
        this.b = bikVar;
        this.c = uiuVar;
        this.d = bboVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bik bikVarCM;
        bfs bfsVar = (bfs) obj;
        ayc aycVar = (ayc) obj2;
        ((Number) obj3).intValue();
        Object objF = aycVar.f();
        Object obj4 = ayb.a;
        if (objF == obj4) {
            got gotVar = new got(bfsVar, new apa(this.d, 1));
            aycVar.w(gotVar);
            objF = gotVar;
        }
        final got gotVar2 = (got) objF;
        Object objF2 = aycVar.f();
        if (objF2 == obj4) {
            objF2 = new hls(new aoj(gotVar2));
            aycVar.w(objF2);
        }
        aov aovVar = this.a;
        hls hlsVar = (hls) objF2;
        if (aovVar != null) {
            aycVar.u(-297369245);
            aycVar.u(-702327745);
            apm apmVar = apo.a;
            if (apmVar != null) {
                aycVar.u(1345608944);
                aycVar.n();
            } else {
                aycVar.u(1345658017);
                View view = (View) aycVar.e(AndroidCompositionLocals_androidKt.f);
                boolean zB = aycVar.B(view);
                Object objF3 = aycVar.f();
                if (zB || objF3 == obj4) {
                    Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                    objF3 = tag instanceof apm ? (apm) tag : null;
                    if (objF3 == null) {
                        objF3 = new ann(view);
                        view.setTag(R.id.compose_prefetch_scheduler, objF3);
                    }
                    aycVar.w(objF3);
                }
                apmVar = (apm) objF3;
                aycVar.n();
            }
            apm apmVar2 = apmVar;
            aycVar.n();
            Object[] objArr = {aovVar, gotVar2, hlsVar, apmVar2};
            boolean zB2 = aycVar.B(aovVar) | aycVar.D(gotVar2) | aycVar.D(hlsVar) | aycVar.D(apmVar2);
            Object objF4 = aycVar.f();
            if (zB2 || objF4 == obj4) {
                objF4 = new aok(aovVar, gotVar2, hlsVar, apmVar2, 0);
                aycVar.w(objF4);
            }
            azb.d(objArr, (uiq) objF4, aycVar);
            aycVar.n();
        } else {
            aycVar.u(-296783035);
            aycVar.n();
        }
        bik bikVar = this.b;
        int i = aow.a;
        if (aovVar != null && (bikVarCM = bikVar.cM(new TraversablePrefetchStateModifierElement(aovVar))) != null) {
            bikVar = bikVarCM;
        }
        boolean zB3 = aycVar.B(gotVar2);
        final uiu uiuVar = this.c;
        boolean zB4 = zB3 | aycVar.B(uiuVar);
        Object objF5 = aycVar.f();
        if (zB4 || objF5 == obj4) {
            objF5 = new uiu() { // from class: aol
                @Override // defpackage.uiu
                public final Object a(Object obj5, Object obj6) {
                    aon aonVar = new aon(gotVar2, (bts) obj5);
                    return (bss) uiuVar.a(aonVar, (cho) obj6);
                }
            };
            aycVar.w(objF5);
        }
        btq.b(hlsVar, bikVar, (uiu) objF5, aycVar, 8);
        return ufg.a;
    }
}
