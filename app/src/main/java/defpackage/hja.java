package defpackage;

import android.speech.tts.UtteranceProgressListener;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hja extends UtteranceProgressListener {
    final /* synthetic */ hjb a;

    public hja(hjb hjbVar) {
        this.a = hjbVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        hjb hjbVar = this.a;
        hjc hjcVarR = hjbVar.r(str);
        if (hjcVarR.equals(hjc.NO_OBJECT)) {
            return;
        }
        switch (hjcVarR.ordinal()) {
            case 12:
            case 13:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            default:
                hjbVar.n = true;
                break;
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        this.a.r(str);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        hjb hjbVar = this.a;
        hjbVar.u = hjc.a(str);
        hjc hjcVar = hjbVar.u;
        Iterator it = hjbVar.g.iterator();
        if (it.hasNext()) {
            hjc hjcVar2 = hjbVar.u;
            throw null;
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStop(String str, boolean z) {
        this.a.r(str);
        super.onStop(str, z);
    }
}
