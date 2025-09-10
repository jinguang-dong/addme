package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum oxq implements oxs {
    a("audio/3gpp"),
    AMR_WB("audio/amr-wb"),
    AAC("audio/mp4a-latm"),
    HE_AAC("audio/mp4a-latm"),
    AAC_ELD("audio/mp4a-latm");

    public final String f;

    oxq(String str) {
        this.f = str;
    }

    @Override // defpackage.oxs
    public final String a() {
        return this.f;
    }
}
