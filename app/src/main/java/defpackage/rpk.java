package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpk extends DataSetObserver {
    final /* synthetic */ TabLayout a;

    public rpk(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.h();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.h();
    }
}
