package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearChipButton;
import com.google.android.clockwork.common.wearable.wearmaterial.list.FadingWearableRecyclerView;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.CenteredRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwd implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public nwd(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.b;
        if (i == 0) {
            WearChipButton wearChipButton = (WearChipButton) this.a;
            wearChipButton.getRootView().getViewTreeObserver().removeOnPreDrawListener(this);
            wearChipButton.t = true;
            return true;
        }
        if (i == 1) {
            ((CoordinatorLayout) this.a).i(0);
            return true;
        }
        if (i != 2) {
            ViewGroup viewGroup = this.a;
            CenteredRecyclerView centeredRecyclerView = (CenteredRecyclerView) viewGroup;
            if (!centeredRecyclerView.ai || centeredRecyclerView.ag.c(viewGroup) == centeredRecyclerView.aj) {
                centeredRecyclerView.getRootView().getViewTreeObserver().removeOnPreDrawListener(centeredRecyclerView.ah);
            }
            return false;
        }
        FadingWearableRecyclerView fadingWearableRecyclerView = (FadingWearableRecyclerView) this.a;
        if (!fadingWearableRecyclerView.ai || fadingWearableRecyclerView.getChildCount() <= 0) {
            return true;
        }
        fadingWearableRecyclerView.aE();
        fadingWearableRecyclerView.ai = false;
        return false;
    }

    public /* synthetic */ nwd(CenteredRecyclerView centeredRecyclerView, int i) {
        this.b = i;
        this.a = centeredRecyclerView;
    }
}
