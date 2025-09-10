package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gf extends FrameLayout {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public gf(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }
}
