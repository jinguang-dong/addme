package androidx.wear.compose.material3;

import defpackage.a;
import defpackage.bij;
import defpackage.bwa;
import defpackage.dkf;
import defpackage.dqs;
import defpackage.uif;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScrollAwayModifierElement extends bwa {
    private final dkf a;
    private final uif b;

    public ScrollAwayModifierElement(dkf dkfVar, uif uifVar) {
        this.a = dkfVar;
        this.b = uifVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new dqs(this.a, this.b);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        dqs dqsVar = (dqs) bijVar;
        dqsVar.a = this.a;
        dqsVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScrollAwayModifierElement scrollAwayModifierElement = (ScrollAwayModifierElement) obj;
        return a.ao(this.a, scrollAwayModifierElement.a) && this.b == scrollAwayModifierElement.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
