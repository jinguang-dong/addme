package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bit {
    public final View a;
    public final cce b;
    public final String c;
    public AutofillId d;
    public boolean e;
    public ys f;
    public final cey g;
    public final ocq h;

    public bit() {
        throw null;
    }

    public bit(ocq ocqVar, cey ceyVar, View view, cce cceVar, String str) {
        this.h = ocqVar;
        this.g = ceyVar;
        this.a = view;
        this.b = cceVar;
        this.c = str;
        new Rect();
        view.setImportantForAutofill(1);
        Object obj = byx.o(view).a;
        if (obj == null) {
            bqs.a("Required value was null.");
            throw new uer();
        }
        this.d = (AutofillId) obj;
        this.f = new ys((byte[]) null);
    }
}
