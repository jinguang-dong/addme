package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class dbg extends li {
    final RecyclerView c;
    final cnn d;
    final cnn e;

    public dbg(RecyclerView recyclerView) {
        super(recyclerView);
        this.d = ((li) this).b;
        this.e = new dbf(this);
        this.c = recyclerView;
    }

    @Override // defpackage.li
    public final cnn j() {
        return this.e;
    }
}
