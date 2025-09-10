package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dih extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public dih(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.e();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.e();
    }
}
