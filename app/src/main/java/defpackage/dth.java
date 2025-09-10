package defpackage;

import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.ui.views.ToggleUi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dth implements ctg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ dth(ToggleUi toggleUi, Runnable runnable, int i) {
        this.c = i;
        this.b = toggleUi;
        this.a = runnable;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.ctg
    public final void a(boolean z, float f) {
        int i = this.c;
        if (i == 0) {
            ((dtj) this.a).d();
            Object obj = this.b;
            if (obj != null) {
                ((dtc) ((AmbientModeSupport.AmbientController) obj).a).b();
                return;
            }
            return;
        }
        if (i != 1) {
            if (z) {
                ((ToggleUi) this.b).g();
                return;
            } else {
                this.a.run();
                return;
            }
        }
        ((dtj) this.a).d();
        Object obj2 = this.b;
        if (obj2 != null) {
            ((dtc) ((AmbientModeSupport.AmbientController) obj2).a).a();
        }
    }

    public /* synthetic */ dth(dtj dtjVar, AmbientModeSupport.AmbientController ambientController, int i) {
        this.c = i;
        this.a = dtjVar;
        this.b = ambientController;
    }
}
