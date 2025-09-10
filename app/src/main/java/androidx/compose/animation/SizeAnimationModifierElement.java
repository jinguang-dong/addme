package androidx.compose.animation;

import defpackage.a;
import defpackage.abl;
import defpackage.acn;
import defpackage.bie;
import defpackage.bij;
import defpackage.bwa;
import defpackage.uiu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeAnimationModifierElement extends bwa {
    private final acn a;
    private final uiu b = null;
    private final bie d;

    public SizeAnimationModifierElement(acn acnVar, bie bieVar) {
        this.a = acnVar;
        this.d = bieVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new abl(this.a, this.d);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        abl ablVar = (abl) bijVar;
        ablVar.a = this.a;
        ablVar.b = this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        if (!a.ao(this.a, sizeAnimationModifierElement.a) || !a.ao(this.d, sizeAnimationModifierElement.d)) {
            return false;
        }
        uiu uiuVar = sizeAnimationModifierElement.b;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.d.hashCode()) * 31;
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.a + ", alignment=" + this.d + ", finishedListener=null)";
    }
}
