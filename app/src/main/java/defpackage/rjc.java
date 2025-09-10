package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rjc {
    public int a;
    public boolean b;
    public final /* synthetic */ BottomSheetBehavior c;
    private final Runnable d = new pgr(this, 15, null);

    public rjc(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    public final void a(int i) {
        BottomSheetBehavior bottomSheetBehavior = this.c;
        WeakReference weakReference = bottomSheetBehavior.B;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.a = i;
        if (this.b) {
            return;
        }
        ((View) bottomSheetBehavior.B.get()).postOnAnimation(this.d);
        this.b = true;
    }
}
