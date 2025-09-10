package defpackage;

import android.view.View;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class az implements cwr {
    final /* synthetic */ bb a;

    public az(bb bbVar) {
        this.a = bbVar;
    }

    @Override // defpackage.cwr
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((cwh) obj) != null) {
            bb bbVar = this.a;
            if (bbVar.b) {
                View viewRequireView = bbVar.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (bbVar.c != null) {
                    if (ch.X(3)) {
                        toString();
                        Objects.toString(bbVar.c);
                    }
                    bbVar.c.setContentView(viewRequireView);
                }
            }
        }
    }
}
