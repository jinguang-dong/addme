package defpackage;

import android.view.View;
import com.google.android.clockwork.common.wearable.wearmaterial.list.FadingWearableRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwn implements nwr {
    final /* synthetic */ FadingWearableRecyclerView a;

    public nwn(FadingWearableRecyclerView fadingWearableRecyclerView) {
        this.a = fadingWearableRecyclerView;
    }

    private final boolean d(View view) {
        return view.getParent() == this.a;
    }

    @Override // defpackage.nwr
    public final boolean a(View view) {
        if (!d(view)) {
            return true;
        }
        FadingWearableRecyclerView fadingWearableRecyclerView = this.a;
        int iC = fadingWearableRecyclerView.c(view);
        ki kiVar = fadingWearableRecyclerView.l;
        kiVar.getClass();
        return iC != kiVar.a() + (-1);
    }

    @Override // defpackage.nwr
    public final boolean b(View view) {
        return (d(view) && this.a.c(view) == 0) ? false : true;
    }

    @Override // defpackage.nwr
    public final void c() {
    }
}
