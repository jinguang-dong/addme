package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvr implements ito {
    final /* synthetic */ AccessibilityManager a;
    final /* synthetic */ lvq b;
    final /* synthetic */ Context c;
    final /* synthetic */ HotshotController d;
    final /* synthetic */ imi e;

    public mvr(HotshotController hotshotController, AccessibilityManager accessibilityManager, lvq lvqVar, Context context, imi imiVar) {
        this.a = accessibilityManager;
        this.b = lvqVar;
        this.c = context;
        this.e = imiVar;
        this.d = hotshotController;
    }

    @Override // defpackage.ito
    public final boolean a(boolean z) {
        if (this.a.isTouchExplorationEnabled() || !HotshotController.b.get()) {
            return false;
        }
        if (z && !((lvp) this.b.dL()).equals(lvp.VOLUME)) {
            HotshotController hotshotController = this.d;
            if (!hotshotController.S) {
                if (hotshotController.R == null) {
                    nao naoVar = new nao();
                    naoVar.j = 8;
                    naoVar.a = false;
                    Context context = this.c;
                    naoVar.h = context;
                    naoVar.e = context.getString(R.string.hotshot_volume_key_notification);
                    hotshotController.R = naoVar.a();
                }
                this.e.a(hotshotController.R);
                hotshotController.S = true;
            }
        }
        return true;
    }

    @Override // defpackage.ito
    public final int b() {
        return 104;
    }

    @Override // defpackage.ito
    public final void c() {
    }
}
