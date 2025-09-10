package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bio {
    public final View a;
    public final AutofillManager b;
    public AutofillId c;
    public final cgg d;

    public bio(View view, cgg cggVar) {
        this.a = view;
        this.d = cggVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.b = autofillManager;
        view.setImportantForAutofill(1);
        Object obj = byx.o(view).a;
        if (obj != null) {
            this.c = (AutofillId) obj;
        } else {
            bqs.a("Required value was null.");
            throw new uer();
        }
    }
}
