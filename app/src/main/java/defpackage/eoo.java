package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class eoo extends dav {
    @Override // defpackage.dav
    protected final ki c(PreferenceScreen preferenceScreen) {
        return eoq.a(requireContext()) ? new eop(preferenceScreen) : new daz(preferenceScreen);
    }

    @Override // defpackage.dav, defpackage.bm
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenD;
        view.getClass();
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenD = d()) != null) {
            preferenceScreenD.y(bundle2);
        }
        if (this.c) {
            e();
        }
        this.d = true;
        if (eoq.a(requireContext())) {
            B((Drawable) null);
            ((dav) this).b.aB(new eon());
        }
    }
}
