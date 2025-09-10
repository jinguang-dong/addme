package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class unb extends ugx implements upj {
    public static final csq b = new csq();
    public final long a;

    public unb(long j) {
        super(b);
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unb) && this.a == ((unb) obj).a;
    }

    @Override // defpackage.upj
    public final /* bridge */ /* synthetic */ Object fO(uhf uhfVar) {
        unc uncVar = (unc) uhfVar.get(unc.b);
        String str = uncVar != null ? uncVar.a : "coroutine";
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iM = ujp.m(name);
        name.getClass();
        int iLastIndexOf = name.lastIndexOf(" @", iM);
        if (iLastIndexOf < 0) {
            iLastIndexOf = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iLastIndexOf + 10);
        String strSubstring = name.substring(0, iLastIndexOf);
        strSubstring.getClass();
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.a);
        threadCurrentThread.setName(sb.toString());
        return name;
    }

    @Override // defpackage.upj
    public final /* bridge */ /* synthetic */ void fP(Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ")";
    }
}
