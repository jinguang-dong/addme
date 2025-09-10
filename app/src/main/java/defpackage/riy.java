package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class riy implements cqe {
    final /* synthetic */ int a;
    final /* synthetic */ BottomSheetBehavior b;

    public riy(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    @Override // defpackage.cqe
    public final boolean a(View view) {
        this.b.ar(this.a);
        return true;
    }
}
