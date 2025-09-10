package defpackage;

import com.google.android.apps.camera.debug.metrics.CYLp.GdpuLBytnYW;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhy {
    public final int a;
    public final Set b;
    public final float c;
    public final float d;
    public final boolean e;
    public final List f;
    public final nhx g;
    public final nhx h;
    public final uiq i;
    public final boolean j;
    public final uiq k;
    public final int l;
    public final int m;

    public nhy() {
        this(0, null, 0.0f, 0.0f, false, 0, null, null, null, null, false, 0, null, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhy)) {
            return false;
        }
        nhy nhyVar = (nhy) obj;
        return this.a == nhyVar.a && a.ao(this.b, nhyVar.b) && Float.compare(this.c, nhyVar.c) == 0 && Float.compare(this.d, nhyVar.d) == 0 && this.e == nhyVar.e && this.l == nhyVar.l && a.ao(this.f, nhyVar.f) && a.ao(this.g, nhyVar.g) && a.ao(this.h, nhyVar.h) && a.ao(this.i, nhyVar.i) && this.j == nhyVar.j && this.m == nhyVar.m && a.ao(this.k, nhyVar.k);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a * 31) + this.b.hashCode()) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        int i = this.l;
        a.aQ(i);
        int iO = (((((iHashCode * 31) + a.o(this.e)) * 31) + i) * 31) + this.f.hashCode();
        nhx nhxVar = this.g;
        int iHashCode2 = ((iO * 31) + (nhxVar == null ? 0 : nhxVar.hashCode())) * 31;
        nhx nhxVar2 = this.h;
        int iHashCode3 = (((((iHashCode2 + (nhxVar2 != null ? nhxVar2.hashCode() : 0)) * 31) + this.i.hashCode()) * 31) + a.o(this.j)) * 31;
        int i2 = this.m;
        a.aQ(i2);
        return ((iHashCode3 + i2) * 31) + this.k.hashCode();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nhy(int i, Set set, float f, float f2, boolean z, int i2, List list, nhx nhxVar, nhx nhxVar2, uiq uiqVar) {
        this(i, set, f, f2, z, i2, list, nhxVar, nhxVar2, uiqVar, false, 0, null, 7168);
        set.getClass();
        list.getClass();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliderConfig(numTickMarks=");
        sb.append(this.a);
        sb.append(", primaryTickIndices=");
        sb.append(this.b);
        sb.append(", tickMarkSpacing=");
        sb.append(this.c);
        sb.append(", defaultSliderProgress=");
        sb.append(this.d);
        sb.append(", hasDefaultProgressCircle=");
        sb.append(this.e);
        sb.append(", touchEndBehavior=");
        int i = this.l;
        sb.append((Object) (i != 1 ? i != 2 ? "SNAP_TO_ANY" : GdpuLBytnYW.dwVbECAk : "NONE"));
        sb.append(", primaryTickLabels=");
        sb.append(this.f);
        sb.append(", leftIconConfig=");
        sb.append(this.g);
        sb.append(", rightIconConfig=");
        sb.append(this.h);
        sb.append(", announceForCameraLiveRegion=");
        sb.append(this.i);
        sb.append(", rotatePrimaryTickLabels=");
        sb.append(this.j);
        sb.append(", slideBehavior=");
        sb.append((Object) (this.m != 1 ? "STICK_TO_PRIMARY" : "SMOOTH"));
        sb.append(", announceForAccessibility=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    public nhy(int i, Set set, float f, float f2, boolean z, int i2, List list, nhx nhxVar, nhx nhxVar2, uiq uiqVar, boolean z2, int i3, uiq uiqVar2) {
        set.getClass();
        if (i2 != 0) {
            list.getClass();
            uiqVar.getClass();
            if (i3 != 0) {
                uiqVar2.getClass();
                this.a = i;
                this.b = set;
                this.c = f;
                this.d = f2;
                this.e = z;
                this.l = i2;
                this.f = list;
                this.g = nhxVar;
                this.h = nhxVar2;
                this.i = uiqVar;
                this.j = z2;
                this.m = i3;
                this.k = uiqVar2;
                return;
            }
        }
        throw null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ nhy(int r16, java.util.Set r17, float r18, float r19, boolean r20, int r21, java.util.List r22, defpackage.nhx r23, defpackage.nhx r24, defpackage.uiq r25, boolean r26, int r27, defpackage.uiq r28, int r29) {
        /*
            Method dump skipped, instructions count: 184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhy.<init>(int, java.util.Set, float, float, boolean, int, java.util.List, nhx, nhx, uiq, boolean, int, uiq, int):void");
    }
}
