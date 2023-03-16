/*
 * Copyright (C) 2022 Parisi Alessandro
 * This file is part of VirtualizedFX (https://github.com/palexdev/VirtualizedFX).
 *
 * VirtualizedFX is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VirtualizedFX is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with VirtualizedFX.  If not, see <http://www.gnu.org/licenses/>.
 */

package app.flow;

import app.Tests;
import fr.brouillard.oss.cssfx.CSSFX;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.scenicview.ScenicView;

public class FlowApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		CSSFX.start();
		Scene scene = new Scene(Tests.FLOW.load());
		primaryStage.setScene(scene);
		primaryStage.setTitle("VirtualFlow Comparison Test");
		primaryStage.show();
		ScenicView.show(scene);
	}
}
