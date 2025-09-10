package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brs {
    public static final brl a;
    public static final btg b;
    public static final brq c;
    public static final brq d;
    public static final brq e;
    public static final brq f;
    public static final brq g;
    public static final brq h;
    public static final brq i;

    static {
        brq brqVar = new brq("caption bar", 1);
        c = brqVar;
        brl brlVar = new brl();
        a = brlVar;
        brq brqVar2 = new brq("ime", 1);
        d = brqVar2;
        brq brqVar3 = new brq("mandatory system gestures", 1);
        e = brqVar3;
        brq brqVar4 = new brq("navigation bars", 1);
        f = brqVar4;
        brq brqVar5 = new brq("status bars", 1);
        g = brqVar5;
        new brq(new btg[]{brqVar5, brqVar4, brqVar}, 0);
        brq brqVar6 = new brq("system gestures", 1);
        h = brqVar6;
        brq brqVar7 = new brq("tappable element", 1);
        i = brqVar7;
        bth bthVar = new bth("waterfall", 0);
        b = bthVar;
        new brq(new btg[]{brqVar5, brqVar4, brqVar, brlVar, brqVar2, brqVar7}, 0);
        new brq(new btg[]{brqVar3, brqVar6, brqVar7, bthVar}, 0);
        new brq(new btg[]{brqVar5, brqVar4, brqVar, brqVar2, brqVar6, brqVar3, brqVar7, brlVar, bthVar}, 0);
    }
}
