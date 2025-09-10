package defpackage;

import android.net.ConnectivityManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.smarts.SmartsChipView;
import com.google.android.apps.camera.ui.hotshot.HotshotController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class loe implements paq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ loe(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View$OnLayoutChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [android.view.ViewTreeObserver$OnScrollChangedListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hpb, java.lang.Object] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        switch (this.c) {
            case 0:
                ((hpo) ((rwc) this.a).c()).f((loa) this.b);
                break;
            case 1:
                ((hpa) this.a.a()).f(this.b);
                break;
            case 2:
                ((SmartsChipView) this.a).removeOnLayoutChangeListener(this.b);
                break;
            case 3:
                ((mca) this.b).h.remove(this.a);
                break;
            case 4:
                ((mcv) this.a).a.remove(this.b);
                break;
            case 5:
                ((AccessibilityManager) this.b).removeTouchExplorationStateChangeListener(((HotshotController) this.a).q);
                break;
            case 6:
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.b;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this.a);
                    break;
                }
                break;
            case 7:
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.b;
                if (viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnScrollChangedListener(this.a);
                    break;
                }
                break;
            case 8:
                ((mwq) this.a).a.remove(this.b);
                break;
            case 9:
                ((mwq) this.a).b.remove(this.b);
                break;
            case 10:
                ((View) this.b).removeCallbacks(this.a);
                break;
            default:
                ((ConnectivityManager) this.a).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.b);
                break;
        }
    }

    public /* synthetic */ loe(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
