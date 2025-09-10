package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkz {
    public final String a;
    public final List b;

    public kkz(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final String toString() {
        rwb rwbVar = new rwb("ValidationResult");
        rwbVar.b("strategy", this.a);
        rwbVar.c("valid", "false");
        rwbVar.b("failed constraints", this.b);
        return rwbVar.toString();
    }
}
