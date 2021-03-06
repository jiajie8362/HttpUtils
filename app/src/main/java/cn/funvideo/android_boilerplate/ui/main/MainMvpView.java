package cn.funvideo.android_boilerplate.ui.main;

import java.util.List;

import cn.funvideo.android_boilerplate.data.model.Ribot;
import cn.funvideo.android_boilerplate.data.model.Subject;
import cn.funvideo.android_boilerplate.ui.base.MvpView;

public interface MainMvpView extends MvpView{

    void showRibots(List<Ribot> ribots);

    void showSubjects(List<Subject> subjects);

    void showRibotsEmpty();

    void showError();
}
