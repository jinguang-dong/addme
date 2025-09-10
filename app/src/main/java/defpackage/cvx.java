package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvx implements der {
    @Override // defpackage.der
    public final void a(deu deuVar) throws NoSuchMethodException, SecurityException {
        if (!(deuVar instanceof cxt)) {
            Objects.toString(deuVar);
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(deuVar.toString()));
        }
        cxb viewModelStore$ar$class_merging = ((cxt) deuVar).getViewModelStore$ar$class_merging();
        det savedStateRegistry = deuVar.getSavedStateRegistry();
        Iterator it = viewModelStore$ar$class_merging.c().iterator();
        while (it.hasNext()) {
            cxm cxmVarB = viewModelStore$ar$class_merging.b((String) it.next());
            if (cxmVarB != null) {
                cvz.c(cxmVarB, savedStateRegistry, deuVar.getLifecycle());
            }
        }
        if (viewModelStore$ar$class_merging.c().isEmpty()) {
            return;
        }
        savedStateRegistry.c(cvx.class);
    }
}
