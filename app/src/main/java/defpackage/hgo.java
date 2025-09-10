package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgo implements fre {
    private final hgs a;
    private final hgq b;
    private final out c;
    private final fdq d;
    private final jgt e;

    public hgo(hgs hgsVar, fdq fdqVar, jgt jgtVar, hgq hgqVar, out outVar) {
        this.a = hgsVar;
        this.d = fdqVar;
        this.e = jgtVar;
        this.b = hgqVar;
        this.c = outVar;
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.fre
    public final syu b() {
        out outVar = this.c;
        jgt jgtVar = this.e;
        hgq hgqVar = this.b;
        ins.g(outVar, jgtVar, hgqVar);
        our ourVarJ = this.d.j();
        hgs hgsVar = this.a;
        hgsVar.a.add(hgqVar);
        ourVarJ.d(new ffx(hgsVar, (hhc) hgqVar, 11));
        return ske.M(true);
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        return gsn.Z(this);
    }
}
