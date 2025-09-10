package androidx.compose.ui.input.pointer;

import defpackage.a;
import defpackage.bij;
import defpackage.bpg;
import defpackage.bpl;
import defpackage.bps;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PointerHoverIconModifierElement extends bwa {
    private final bps a;
    private final boolean b = false;

    public PointerHoverIconModifierElement(bps bpsVar) {
        this.a = bpsVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new bpl(this.a);
    }

    @Override // defpackage.bwa
    public final /* synthetic */ void b(bij bijVar) {
        bpl bplVar = (bpl) bijVar;
        bps bpsVar = bplVar.a;
        bps bpsVar2 = this.a;
        if (a.ao(bpsVar, bpsVar2)) {
            return;
        }
        bplVar.a = bpsVar2;
        if (bplVar.b) {
            bplVar.d();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        if (!a.ao(this.a, pointerHoverIconModifierElement.a)) {
            return false;
        }
        boolean z = pointerHoverIconModifierElement.b;
        return true;
    }

    public final int hashCode() {
        return (((bpg) this.a).a * 31) + 1237;
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
