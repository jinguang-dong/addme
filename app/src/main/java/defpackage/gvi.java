package defpackage;

import com.google.android.apps.camera.composezoom.ZoomUi;
import com.google.android.apps.camera.ui.creativebutton.CreativeButton;
import com.google.android.apps.camera.ui.supermodeswitcher.SupermodeSwitcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvi implements uiu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public gvi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, uiu] */
    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            ayc aycVar = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar.G()) {
                aycVar.r();
            } else {
                ZoomUi zoomUi = (ZoomUi) this.a;
                azr azrVar = zoomUi.d;
                gsn.O(zoomUi.e(), zoomUi.c, azrVar, aycVar, 0);
            }
            return ufg.a;
        }
        if (i == 1) {
            ayc aycVar2 = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar2.G()) {
                aycVar2.r();
            } else {
                this.a.a(aycVar2, 0);
            }
            return ufg.a;
        }
        if (i == 2) {
            ayc aycVar3 = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar3.G()) {
                aycVar3.r();
            } else {
                CreativeButton creativeButton = (CreativeButton) this.a;
                qpt.br(creativeButton.e(), creativeButton.b, aycVar3, 0);
            }
            return ufg.a;
        }
        if (i != 3) {
            ayc aycVar4 = (ayc) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && aycVar4.G()) {
                aycVar4.r();
            } else {
                qpt.bd(aycVar4).b(bdq.k(-1563166619, new gvi(this.a, 3), aycVar4), aycVar4, 6);
            }
            return ufg.a;
        }
        ayc aycVar5 = (ayc) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && aycVar5.G()) {
            aycVar5.r();
        } else {
            qpt.aU(((SupermodeSwitcher) this.a).a, aycVar5, 0);
        }
        return ufg.a;
    }
}
