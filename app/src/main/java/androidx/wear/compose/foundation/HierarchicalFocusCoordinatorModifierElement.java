package androidx.wear.compose.foundation;

import defpackage.bij;
import defpackage.bwa;
import defpackage.dkb;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class HierarchicalFocusCoordinatorModifierElement extends bwa {
    private final boolean a = true;
    private final boolean b = true;
    private final uiq d = null;

    @Override // defpackage.bwa
    public final /* synthetic */ bij a() {
        return new dkb();
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        dkb dkbVar = (dkb) bijVar;
        dkbVar.d = null;
        dkbVar.c = true;
        if (!dkbVar.e) {
            dkbVar.e = true;
            dkbVar.f();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HierarchicalFocusCoordinatorModifierElement)) {
            return false;
        }
        HierarchicalFocusCoordinatorModifierElement hierarchicalFocusCoordinatorModifierElement = (HierarchicalFocusCoordinatorModifierElement) obj;
        boolean z = hierarchicalFocusCoordinatorModifierElement.a;
        boolean z2 = hierarchicalFocusCoordinatorModifierElement.b;
        uiq uiqVar = hierarchicalFocusCoordinatorModifierElement.d;
        return true;
    }

    public final int hashCode() {
        return 1184222;
    }
}
