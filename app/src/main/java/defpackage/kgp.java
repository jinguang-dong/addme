package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kgp {
    public static final sgv a = sgv.g("kgp");
    public our b;
    public syu c;
    public jtd d;
    public kgw e;
    private final pci f;
    private final ngk g;
    private final hfy h;
    private final pkc i;
    private final hbj j;
    private final mwq k;

    public kgp(pci pciVar, mwq mwqVar, pkc pkcVar, ngk ngkVar, hbj hbjVar, hfy hfyVar) {
        this.f = pciVar;
        this.k = mwqVar;
        this.i = pkcVar;
        this.g = ngkVar;
        this.j = hbjVar;
        this.h = hfyVar;
        this.b = pciVar.a();
    }

    public final jtg a(gnt gntVar, kgt kgtVar, nkw nkwVar) {
        kgtVar.getClass();
        jtg jtgVar = new jtg(new esl(this, kgtVar, 2));
        hfy hfyVar = this.h;
        hbj hbjVar = this.j;
        pka pkaVarA = gntVar.a();
        pkc pkcVar = this.i;
        pjr pjrVarA = hfyVar.a(pkcVar, hbjVar, pkaVarA);
        pjrVarA.getClass();
        jtd jtdVarD = this.k.D(pjrVarA, nkwVar);
        this.d = jtdVarD;
        this.b.close();
        String strValueOf = String.valueOf(toString());
        pci pciVar = this.f;
        paq paqVarB = pciVar.b("CaptureCameraDeviceOpener : ".concat(strValueOf));
        our ourVarA = pciVar.a();
        ourVarA.d(paqVarB);
        this.b = ourVarA;
        this.e = pkcVar.f(jtdVarD.a);
        fsc fscVar = new fsc();
        ourVarA.d(fscVar);
        syu syuVarB = kgtVar.b(jtdVarD, ske.M(this.g));
        this.c = syuVarB;
        ske.W(syuVarB, new kgo(this, fscVar, jtgVar, ourVarA), ojl.bZ("CCDevMngr"));
        return jtgVar;
    }
}
