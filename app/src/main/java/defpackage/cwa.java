package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwa {
    private static final /* synthetic */ uhu $ENTRIES;
    private static final /* synthetic */ cwa[] $VALUES;
    public static final cvz Companion;
    public static final cwa ON_ANY;
    public static final cwa ON_CREATE;
    public static final cwa ON_DESTROY;
    public static final cwa ON_PAUSE;
    public static final cwa ON_RESUME;
    public static final cwa ON_START;
    public static final cwa ON_STOP;

    static {
        cwa cwaVar = new cwa("ON_CREATE", 0);
        ON_CREATE = cwaVar;
        cwa cwaVar2 = new cwa("ON_START", 1);
        ON_START = cwaVar2;
        cwa cwaVar3 = new cwa("ON_RESUME", 2);
        ON_RESUME = cwaVar3;
        cwa cwaVar4 = new cwa("ON_PAUSE", 3);
        ON_PAUSE = cwaVar4;
        cwa cwaVar5 = new cwa("ON_STOP", 4);
        ON_STOP = cwaVar5;
        cwa cwaVar6 = new cwa("ON_DESTROY", 5);
        ON_DESTROY = cwaVar6;
        cwa cwaVar7 = new cwa("ON_ANY", 6);
        ON_ANY = cwaVar7;
        cwa[] cwaVarArr = {cwaVar, cwaVar2, cwaVar3, cwaVar4, cwaVar5, cwaVar6, cwaVar7};
        $VALUES = cwaVarArr;
        $ENTRIES = ske.aB(cwaVarArr);
        Companion = new cvz();
    }

    private cwa(String str, int i) {
    }

    public static cwa[] values() {
        return (cwa[]) $VALUES.clone();
    }

    public final cwb a() {
        switch (ordinal()) {
            case 0:
            case 4:
                return cwb.c;
            case 1:
            case 3:
                return cwb.d;
            case 2:
                return cwb.e;
            case 5:
                return cwb.a;
            case 6:
                toString();
                throw new IllegalArgumentException(toString().concat(pAAtrB.NzYdqtHXGITxLqk));
            default:
                throw new uet();
        }
    }
}
