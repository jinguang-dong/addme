package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.FadingWearableRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwo extends byi {
    final /* synthetic */ FadingWearableRecyclerView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwo(FadingWearableRecyclerView fadingWearableRecyclerView) {
        super((char[]) null);
        this.a = fadingWearableRecyclerView;
    }

    @Override // defpackage.byi
    public final void cF() {
        FadingWearableRecyclerView fadingWearableRecyclerView = this.a;
        fadingWearableRecyclerView.aD(fadingWearableRecyclerView.a(0), fadingWearableRecyclerView.a(1));
    }

    @Override // defpackage.byi
    public final void cH(int i, int i2) {
        if (i <= 1) {
            FadingWearableRecyclerView fadingWearableRecyclerView = this.a;
            fadingWearableRecyclerView.aD(fadingWearableRecyclerView.a(0), fadingWearableRecyclerView.a(1));
        }
    }

    @Override // defpackage.byi
    public final void cI(int i, int i2) {
        int i3;
        if (i <= 1) {
            FadingWearableRecyclerView fadingWearableRecyclerView = this.a;
            if (fadingWearableRecyclerView.E != null) {
                if (i == 0) {
                    i3 = i2 + 1;
                } else {
                    i3 = i == 1 ? i2 + 1 : 1;
                    i2 = 0;
                }
                fadingWearableRecyclerView.aD(fadingWearableRecyclerView.a(i2), fadingWearableRecyclerView.a(i3));
                return;
            }
        }
        FadingWearableRecyclerView fadingWearableRecyclerView2 = this.a;
        fadingWearableRecyclerView2.aD(fadingWearableRecyclerView2.a(0), fadingWearableRecyclerView2.a(1));
    }
}
