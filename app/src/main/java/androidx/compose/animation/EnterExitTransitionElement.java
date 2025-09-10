package androidx.compose.animation;

import defpackage.a;
import defpackage.aas;
import defpackage.aay;
import defpackage.aaz;
import defpackage.aba;
import defpackage.adi;
import defpackage.ado;
import defpackage.bij;
import defpackage.bwa;
import defpackage.uif;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EnterExitTransitionElement extends bwa {
    private final ado a;
    private final adi b = null;
    private final adi d = null;
    private final adi e = null;
    private final aaz f;
    private final aba g;
    private final uif h;
    private final aas i;

    public EnterExitTransitionElement(ado adoVar, aaz aazVar, aba abaVar, uif uifVar, aas aasVar) {
        this.a = adoVar;
        this.f = aazVar;
        this.g = abaVar;
        this.h = uifVar;
        this.i = aasVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new aay(this.a, this.f, this.g, this.h, this.i);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        aay aayVar = (aay) bijVar;
        aayVar.a = this.a;
        aayVar.b = this.f;
        aayVar.c = this.g;
        aayVar.d = this.h;
        aayVar.e = this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        if (!a.ao(this.a, enterExitTransitionElement.a)) {
            return false;
        }
        adi adiVar = enterExitTransitionElement.b;
        if (!a.ao(null, null)) {
            return false;
        }
        adi adiVar2 = enterExitTransitionElement.d;
        if (!a.ao(null, null)) {
            return false;
        }
        adi adiVar3 = enterExitTransitionElement.e;
        return a.ao(null, null) && a.ao(this.f, enterExitTransitionElement.f) && a.ao(this.g, enterExitTransitionElement.g) && a.ao(this.h, enterExitTransitionElement.h) && a.ao(this.i, enterExitTransitionElement.i);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 923521) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.a + ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter=" + this.f + ", exit=" + this.g + ", isEnabled=" + this.h + ", graphicsLayerBlock=" + this.i + ')';
    }
}
