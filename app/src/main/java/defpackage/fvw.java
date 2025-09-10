package defpackage;

import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.SnapshotButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvw extends ndp {
    final /* synthetic */ ndc a;
    final /* synthetic */ SnapshotButton b;

    public fvw(SnapshotButton snapshotButton, ndc ndcVar) {
        this.a = ndcVar;
        this.b = snapshotButton;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void b(boolean z) throws Resources.NotFoundException {
        this.b.k(z, this.a);
    }
}
