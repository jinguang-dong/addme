package defpackage;

import android.util.Pair;
import android.widget.PopupWindow;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class htm implements PopupWindow.OnDismissListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public htm(gk gkVar, int i) {
        this.b = i;
        this.a = gkVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.b;
        if (i == 0) {
            our ourVar = ((hto) this.a).g;
            if (ourVar != null) {
                ourVar.close();
                return;
            }
            return;
        }
        if (i == 1) {
            ((gk) this.a).c();
            return;
        }
        List<Pair> list = ((nfk) this.a).u;
        if (list == null) {
            return;
        }
        for (Pair pair : list) {
            ((Executor) pair.second).execute((Runnable) pair.first);
        }
    }

    public /* synthetic */ htm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
